import React from "react";
import GamesCard from "./GamesCard"
import { useEffect, useState } from "react";

function GameStore() {
  const [gameStore, setGames] = useState([]);
;

  useEffect(() => {
    fetch("http://localhost:8080/games")
      .then((response) => response.json())
      .then((result) => setGames(result))
      .catch(console.log);
  }, []);
}

export default GameStore;
