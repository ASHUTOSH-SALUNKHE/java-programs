import { Link } from 'react-router-dom'

function Navbar() {
  return (
    <div className="navbar">
      <h2>My Store</h2>
      <div className="nav-buttons">
        <Link to="/">
          <button>Home</button>
        </Link>
        <Link to="/mobiles">
          <button>Mobiles</button>
        </Link>
        <Link to="/laptops">
          <button>Laptops</button>
        </Link>
      </div>
    </div>
  )
}

export default Navbar
