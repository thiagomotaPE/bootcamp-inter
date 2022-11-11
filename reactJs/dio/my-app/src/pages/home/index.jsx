import {useNavigate} from 'react-router-dom';
import { Button } from '../../components/Button';
import { Header } from '../../components/Header';
import Banner from '../../assets/banner.png';
import { 
    Container,
    Title,
    TitleHighlight,
    TextContent
} from './styles';


const Home = () => {


    //navegação entre paginas usando hooks
    const navigate = useNavigate();

    const handleClickSignIn = () => {
        navigate('/login')
    }

    return (<>
        <Header />
        <Container>
            <div>
                <Title>
                    <TitleHighlight>
                        Implemente
                        <br />
                    </TitleHighlight>
                    O seu futuro global agora!
                </Title>
                <br />
                <TextContent>
                    Domine as tecnologias utilizadas pelas empresas mais inovadoras do mundo e encare seu novo desafio profissional, evoluindo em comunidade  com os melhores experts.
                </TextContent>
                <br />
                <Button title="Começar agora" variant="secondary" onClick={handleClickSignIn} />
            </div>
            <div>
                <img src={Banner} alt="imagem principal" />
            </div>
        </Container>
    </>
    )
}

export {Home}