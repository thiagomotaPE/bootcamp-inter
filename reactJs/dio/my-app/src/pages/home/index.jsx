import {Link} from 'react-router-dom';
import { Button } from '../../components/Button';

const Home = () => {
    return (<>
        <h1>Home</h1>
        <Button title="teste1"/>
        <Button title="teste2" variant="secundary" />
        <Link to="/Login">Fazer Login</Link>
        </>
    )
}

export {Home}