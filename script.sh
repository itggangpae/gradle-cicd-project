IMAGE_NAME="ggnagpae1/calculator"
TAG="latest"

# 기존 이미지가 있는지 확인
if docker images | grep -q "$IMAGE_NAME"; then
    echo "이미지 $IMAGE_NAME:$TAG 삭제 중..."
    docker rmi -f "$IMAGE_NAME:$TAG"
fi

# 새 이미지 다운로드
echo "이미지 $IMAGE_NAME:$TAG 다운로드 중..."
docker pull "$IMAGE_NAME:$TAG"

echo "작업 완료!"