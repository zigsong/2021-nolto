package com.wooteco.nolto.user.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    private User user1;

    /*@BeforeEach
    void setUp() {
        user1 = new User("user1@email.com", "pass1", "찰리", "charlie.png");
    }

    @DisplayName("context가 제대로 생성되고 설정이 됐는지 확인한다.")
    @Test
    public void context() {
    }

    @DisplayName("User 객체 데이터베이스에 저장 된다.")
    @Test
    public void save() {
        // when
        User savedUser = userRepository.save(user1);

        // then
        assertThat(savedUser.getId()).isNotNull();
        checkSameInfo(savedUser, user1);
    }

    @DisplayName("이미 존재하는 email을 가진 User를 저장하려고 하면 예외가 발생한다.")
    @Test
    public void saveWithDuplicatedEmail() {
        // given
        userRepository.save(user1);
        User duplcatedEmailUser = new User(user1.getEmail(), "password", "포모", "image_sample.png");

        // when then
        assertThatThrownBy(() -> userRepository.save(duplcatedEmailUser))
                .isInstanceOf(DataIntegrityViolationException.class);
    }

    @DisplayName("이미 존재하는 nickname을 가진 User를 저장하려고 하면 예외가 발생한다.")
    @Test
    public void saveWithDuplicatedNickname() {
        // given
        userRepository.save(user1);
        User duplcatedNicknameUser = new User("joel@test.com", "password", user1.getNickName(), "image_sample.png");

        // when then
        assertThatThrownBy(() -> userRepository.save(duplcatedNicknameUser))
                .isInstanceOf(DataIntegrityViolationException.class);
    }

    @DisplayName("유저의 id로 저장된 유저 정보를 조회해올 수 있다.")
    @Test
    public void findById() {
        // given
        User savedUser = userRepository.save(user1);

        // when
        User findUser = userRepository.findById(savedUser.getId()).orElseThrow(NotFoundException::new);

        // then
        assertThat(savedUser.getId()).isEqualTo(findUser.getId());
        checkSameInfo(savedUser, findUser);
    }

    @DisplayName("존재하지 않는 유저의 id로 유저 정보를 조회하면 Optional.empty() 객체를 반환한다.")
    @Test
    public void findByNonExistsId() {
        // when
        Optional<User> optionalUser = userRepository.findById(Long.MAX_VALUE);

        // then
        assertThat(optionalUser).isEmpty();
    }

    @DisplayName("유저의 email로 저장된 유저 정보를 조회해올 수 있다.")
    @Test
    public void findByEmail() {
        User savedUser = userRepository.save(user1);

        // when
        User findUser = userRepository.findByEmail(savedUser.getEmail()).orElseThrow(NotFoundException::new);

        // then
        assertThat(savedUser.getId()).isEqualTo(findUser.getId());
        checkSameInfo(savedUser, findUser);
    }

    @DisplayName("존재하지 않는 유저의 email로 유저 정보를 조회하면 Optional.empty() 객체를 반환한다.")
    @Test
    public void findByNonExistsEmail() {
        // when
        Optional<User> optionalUser = userRepository.findByEmail("NonExistsEmail");

        // then
        assertThat(optionalUser).isEmpty();
    }

    @DisplayName("유저와 같은 Id를 가진 유저를 생성해서 저장하면 저장소의 데이터가 수정된다.")
    @Test
    public void updateOtherCase() {
        // given
        User savedUser = userRepository.save(user1);
        String newEmail = "update@test.com";
        String newNickName = "updateNickName";
        String newPassword = "newPassword";
        String newImageUrl = "updateImageUrl";
        User updatedUser = new User(savedUser.getId(), newEmail, newPassword, newNickName, newImageUrl);

        // when
        userRepository.save(updatedUser);
        checkSameInfo(savedUser, updatedUser);
    }

    @DisplayName("존재하는 유저의 데이터를 삭제할 수 있다.")
    @Test
    public void delete() {
        // given
        User savedUser = userRepository.save(user1);

        // when
        userRepository.delete(savedUser);
        List<User> allUsers = userRepository.findAll();

        // then
        assertThat(allUsers).hasSize(0);
    }

    @DisplayName("저장된 유저의 ID와 같은 ID를 가진 객체로 저장을 시도해도 삭제가 가능하다.")
    @Test
    public void deleteWithSameIdAndDiffInfoObject() {
        // given
        userRepository.save(user1);
        User otherUser = new User(user1.getId(), "1234", "1234", "1234");

        // when
        userRepository.delete(otherUser);
        List<User> allUsers = userRepository.findAll();

        // then
        assertThat(allUsers).hasSize(0);
    }

    @DisplayName("존재하지 않는 유저를 삭제하려고 하면 정상 실행된다.")
    @Test
    public void deleteWithNonExistsId() {
        // when
        userRepository.delete(user1);

        // then
        assertThatNoException();
    }

    private void checkSameInfo(User user1, User user2) {
        assertThat(user1.getEmail()).isEqualTo(user2.getEmail());
        assertThat(user1.getPassword()).isEqualTo(user2.getPassword());
        assertThat(user1.getNickName()).isEqualTo(user2.getNickName());
    }*/
}