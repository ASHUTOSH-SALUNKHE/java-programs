import { useNavigate } from 'react-router-dom'

function Navbar() {
  const navigate = useNavigate()

  return (
    <div className="navbar">
      <h2>My Store</h2>
      <div className="nav-buttons">
        <button onClick={() => navigate('/')}>Home</button>
        <button onClick={() => navigate('/mobiles')}>Mobiles</button>
        <button onClick={() => navigate('/laptops')}>Laptops</button>
      </div>
    </div>
  )
}

export default Navbar
