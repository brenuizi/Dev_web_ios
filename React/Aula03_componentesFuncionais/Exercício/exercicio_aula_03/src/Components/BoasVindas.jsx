import PropTypes from 'prop-types';

const BoasVindas = (props) => {
    return (
        <section>
            <h1>Seja bem vindo(a) {props.nome}</h1>
            <p>O React é uma biblioteca JavaScript de código aberto com foco em criar interfaces de usuário em páginas web. </p>
        </section>
    )

};

BoasVindas.defaultProps = {
    nome: 'Nome Padrão'
};

BoasVindas.propTypes = {
    nome: PropTypes.string,
};

export default BoasVindas;