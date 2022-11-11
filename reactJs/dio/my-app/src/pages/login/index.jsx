import { Button } from '../../components/Button';
import { Header } from '../../components/Header';
import { Input } from '../../components/Input';
import { 
    Column,
    Container,
    CriarContaText,
    EsqueciText,
    Row,
    SubTitleLogin,
    Title,
    TitleLogin,
    Wrapper
} from './styles';


const Login = () => {
    return (<>
        <Header />
        <Container>
            <Column>
                <Title>
                    A plataforma para você aprender com experts, dominar as principais tecnologias e entrar mais rapido nas empresas mais desejadas.
                </Title>
            </Column>
            
            <Column>
                <Wrapper>
                    <TitleLogin>Faça seu cadastro</TitleLogin>  
                    <SubTitleLogin>Faça seu login e make the change._</SubTitleLogin>
                    <form>
                        <Input placeholder="E-mail" />
                        <Input placeholder="Senha" type="password" />
                        <Button title="Entrar" variant='secondary'></Button>
                    </form>

                    <Row>
                        <EsqueciText>Esqueci minha senha</EsqueciText>
                        <CriarContaText>Criar conta</CriarContaText>
                    </Row>
                </Wrapper>
            </Column>
        </Container>
    </>
    )
}

export {Login}