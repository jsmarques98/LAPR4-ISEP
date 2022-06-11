/*
 * Copyright (c) 2013-2021 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.ordermanagement.repositories.CustomerOrderRepository;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.base.questionnairemanagement.repositories.QuestionnaireRepository;
import eapli.base.shoppingCartmanagement.repositories.ShoppingCartRepository;
import eapli.base.warehousemanagement.repository.*;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.JpaAutoTxUserRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

/**
 *
 * Created by nuno on 21/03/16.
 */
public class JpaRepositoryFactory implements RepositoryFactory {

    @Override
    public UserRepository users(final TransactionalContext autoTx) {
        return new JpaAutoTxUserRepository(autoTx);
    }

    @Override
    public UserRepository users() {
        return new JpaAutoTxUserRepository(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

    @Override
    public JpaClientUserRepository clientUsers(final TransactionalContext autoTx) {
        return new JpaClientUserRepository(autoTx);
    }

    @Override
    public JpaClientUserRepository clientUsers() {
        return new JpaClientUserRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext autoTx) {
        return new JpaSignupRequestRepository(autoTx);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return new JpaSignupRequestRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public JpaProductRepository products() {
        return new JpaProductRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public ProductRepository products(TransactionalContext autoTx) {
        return new JpaProductRepository(autoTx);
    }

    @Override
    public CustomerRepository customers() {
        return new JpaCustomerRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public CustomerRepository customers(TransactionalContext autoTx) {
        return new JpaCustomerRepository(autoTx);
    }

    @Override
    public QuestionnaireRepository questionnaire() {
        return new JpaQuestionnaireRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public QuestionnaireRepository questionnaire(TransactionalContext autoTx) {
        return new JpaQuestionnaireRepository(autoTx);
    }

    @Override
    public JpaCategoryRepository category() {
        return new JpaCategoryRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AGVRepository agvs() {
        return new JpaAGVRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AGVRepository agvs(TransactionalContext autoTx) {
        return new JpaAGVRepository(autoTx);
    }

    @Override
    public WarehouseRepository warehouse() {
        return new JpaWarehouseRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public WarehouseRepository warehouse(TransactionalContext autoTx) {
        return new JpaWarehouseRepository(autoTx);
    }

    @Override
    public RowAisleRepository rowAisle() {
        return new JpaRowAisleRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public RowAisleRepository rowAisle(TransactionalContext autoTx) {
        return new JpaRowAisleRepository(autoTx);
    }



    @Override
    public AisleRepository aisle() {
        return new JpaAisleRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AisleRepository aisle(TransactionalContext autoTx) {
        return new JpaAisleRepository(autoTx);
    }

    @Override
    public CategoryRepository category(TransactionalContext autoTx) {
        return new JpaCategoryRepository(autoTx);
    }

    @Override
    public AGVDockRepository aGVDock() {
        return new JpaAGVDockRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AGVDockRepository aGVDock(TransactionalContext autoTx) {
        return new JpaAGVDockRepository(autoTx);
    }

    @Override
    public CustomerOrderRepository customerOrder() {
        return new JpaCustomerOrderRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public CustomerOrderRepository customerOrder(TransactionalContext autoTx) {
        return new JpaCustomerOrderRepository(autoTx);
    }

    @Override
    public ShoppingCartRepository shoppingCart() {
        return new JpaShoppingCartRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AnswerQuestionaireRepository answerQuestionaire() {
        return new JpaAnswerQuestionaireRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AnswerQuestionaireRepository answerQuestionaire(TransactionalContext autoTx) {
        return new JpaAnswerQuestionaireRepository(autoTx);
    }

    @Override
    public ShoppingCartRepository shoppingCart(TransactionalContext autoTx) {
        return new JpaShoppingCartRepository(autoTx);
    }


    @Override
    public TransactionalContext newTransactionalContext() {
        return JpaAutoTxRepository.buildTransactionalContext(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

}
