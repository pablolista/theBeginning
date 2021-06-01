'''
CRIAÇÃO DO APP PARA RASTREIO DOS JOGOS DE LOL AFIM DE APOSTAS

ACESSAR CADA PARTICULARIDADE INDIVIDUAL POR MEIO DE MENU

CRIAR AUTOMAÇÃO PARA ADIÇÃO DE NOVOS JOGOS AOS MOLDES DO modelo

ADICIONAR AO modelo CONTADOR AUTOMATICO DE KILLS AO VERIFICAR OS KDAS
CALCULAR TOTAL DE TORRES DESTRUIDAS
ADICIONAR OURO TOTAL DA PARTIDA
'''

modelo = {"jogo1": {'time1': {'comp': {"top": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']},
                                        "jg": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']},
                                        "mid": {"campeao": 'camptop', "FB": True, "CS": '200', "KDA": ['10', '3', '5']},
                                        "adc": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']},
                                        "sup": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']}},
                                        'drags': {'drag1': ['tipo', 'timestamp'], 'drag2': ['tipo', 'timestamp']},
                                        'baron': {'baron1': ['timestamp']},
                                        "torresQqbrou": "11",
                                        'venceu?': True},
                    'time2': {'comp': {"top": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']},
                                        "jg": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']},
                                        "mid": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']},
                                        "adc": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']},
                                        "sup": {"campeao": 'camptop', "FB": False, "CS": '200', "KDA": ['10', '3', '5']}},
                                        'drags': {'drag1': ['tipo', 'timestamp'], 'drag2': ['tipo', 'timestamp']},
                                        'baron': {'baron1': ['timestamp']},
                                        "torresQqbrou": "5",
                                        'venceu?': False},
                    'duration': '45:34',
                    'totalGold': '100.150,35'}}
controle = {}

print(modelo['jogo1']['time1']['comp']['top'])