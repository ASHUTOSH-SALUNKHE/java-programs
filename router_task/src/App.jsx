import { Routes, Route } from 'react-router-dom'
import Navbar from './components/Navbar'
import Home from './components/Home'
import Mobiles from './components/Mobiles'
import Laptops from './components/Laptops'

function App() {
  return (
    <div>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="mobiles" element={<Mobiles />} />
        <Route path="laptops" element={<Laptops />} />
      </Routes>
    </div>
  )
}

export default App
