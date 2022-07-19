import "./App.css";

import GamesItem from './Components/GameComponent/GamesItem';
import ShirtItem from './Components/Tshirts/ShirtItem';
import ConsoleItem from './Components/Consoles/ConsoleItem';

function App() {
  return (
    <main className="container">
      {/* <GamesItem/> */}
      <ShirtItem/>
      <ConsoleItem/>
    </main>
  );
}


export default App;